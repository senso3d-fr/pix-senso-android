package fr.senso3d.pixsenso

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.print.PrintManager
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.ViewGroup

class MainActivity : Activity() {
    private lateinit var webView: WebView

    private inner class PrintBridge {
        @JavascriptInterface
        fun print() {
            runOnUiThread {
                val printManager = getSystemService(Context.PRINT_SERVICE) as PrintManager
                printManager.print(
                    "Pix-Senso",
                    webView.createPrintDocumentAdapter("Pix-Senso"),
                    null
                )
            }
        }
    }

    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        webView = WebView(this)
        webView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.allowFileAccess = true
        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewClient()
        webView.addJavascriptInterface(PrintBridge(), "PixSensoAndroid")
        setContentView(webView)
        webView.loadUrl("file:///android_asset/index.html")
    }

    override fun onResume() {
        super.onResume()
        if (::webView.isInitialized) {
            webView.post {
                webView.evaluateJavascript(
                    "if (window.__pixSensoRestorePrintState) window.__pixSensoRestorePrintState();",
                    null
                )
            }
        }
    }

    @Deprecated("Deprecated in Android API")
    override fun onBackPressed() {
        if (webView.canGoBack()) webView.goBack() else super.onBackPressed()
    }
}
