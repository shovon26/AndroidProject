package com.example.gridview;

import android.app.DownloadManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    private String option;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView=findViewById(R.id.webViewId);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setDownloadListener(new DownloadListener() {
                @Override
                public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                        DownloadManager.Request myRequest = new DownloadManager.Request(Uri.parse(url));
                        myRequest.allowScanningByMediaScanner();
                        myRequest.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);

                        DownloadManager myManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
                        myManager.enqueue(myRequest);
                        Toast.makeText(WebActivity.this,"your file is downloading...",Toast.LENGTH_LONG).show();
                }
        });
        Bundle bundle =getIntent().getExtras();
        if(bundle!=null){
            option=bundle.getString("option");
            setUrl(option);
        }
    }

    public void setUrl(String option){

        ///ADMISSION

            if(option.equals("DUAdmission")){
             webView.loadUrl("https://admission.eis.du.ac.bd/index.php?act=login/index");
            }

            else if(option.equals("RUAdmission")){
              webView.loadUrl("http://admission.ru.ac.bd/undergraduate/");
            }

            else if(option.equals("BAUAdmission")){
               webView.loadUrl("https://admission-agri.org/");
            }

            else if(option.equals("BUETAdmission")){
                    webView.loadUrl("http://ugadmission.buet.ac.bd/");
            }

            else if(option.equals("CUAdmission")){
                    webView.loadUrl("https://admission.cu.ac.bd/");
            }

            else if(option.equals("JUAdmission")){
                    webView.loadUrl("https://ju-admission.org/");
            }

            else if(option.equals("IUAdmission")){
                    webView.loadUrl("https://www.iu.ac.bd/index.php/site/notice/");
            }

            else if(option.equals("SUSTAdmission")){
                    webView.loadUrl("https://admission.sust.edu/");
            }

            else if(option.equals("KUAdmission")){
                    webView.loadUrl("https://ku.ac.bd/undergraduate");
            }

            else if(option.equals("BSMMUAdmission")){
                    webView.loadUrl("");
            }

            else if(option.equals("BSMRAUAdmission")){
                    webView.loadUrl("http://exam.bsmmu.edu.bd/nonres_2019/local/admission/");
            }

            else if(option.equals("HSTUAdmission")){
                    webView.loadUrl("https://www.hstu.ac.bd/admission");
            }

            else if(option.equals("MBSTUAdmission")){
                    webView.loadUrl("https://mbstu.ac.bd/admission.html");
            }

            else if(option.equals("PSTUAdmission")){
                    webView.loadUrl("https://www.pstu.ac.bd/admission/undergraduate");
            }

            else if(option.equals("SAUAdmission")){
                    webView.loadUrl("https://admission-agri.org/");
            }

            else if(option.equals("DUETAdmission")){
                    webView.loadUrl("http://www.duet.ac.bd/admission/undergraduate-admission/");
            }

            else if(option.equals("RUETAdmission")){
                    webView.loadUrl("http://www.ruet.ac.bd/admission/");
            }

            else if(option.equals("CUETAdmission")){
                    webView.loadUrl("https://www.cuet.ac.bd/admission");
            }

            else if(option.equals("KUETAdmission")){
                    webView.loadUrl("http://admission.kuet.ac.bd/adm/");
            }

            else if(option.equals("JNUAdmission")){
                    webView.loadUrl("http://admissionjnu.info/");
            }

            else if(option.equals("JKNNIUAdmission")){
                    webView.loadUrl("https://jkkniu.admission.online/");
            }

            else if(option.equals("CVASUAdmission")){
                    webView.loadUrl("http://cvasu.ac.bd/index.php/admission/");
            }

            else if(option.equals("StAUAdmission")){
                    webView.loadUrl("https://admission-agri.org/");
            }

            else if(option.equals("CoUAdmission")){
                    webView.loadUrl("https://www.cou.ac.bd/undergraduate_admissioncircular");
            }

            else if(option.equals("NSTUAdmission")){
                    webView.loadUrl("https://nstu.admission.online/");
            }

            else if(option.equals("JUSTAdmission")){
                    webView.loadUrl("https://just.edu.bd/admissions/undergraduate");
            }

            else if(option.equals("PUSTAdmission")){
                    webView.loadUrl("https://www.pust.ac.bd/admission/undergraduate");
            }

            else if(option.equals("BUPAdmission")){
                    webView.loadUrl("http://admission.bup.edu.bd/Admission/Home");
            }

            else if(option.equals("BRUAdmission")){
                    webView.loadUrl("https://brur.ac.bd/udergraduate/");
            }

            else if(option.equals("BUTexAdmission")){
                    webView.loadUrl("https://www.butex.edu.bd/result-published-of-b-sc-in-textile-engineering-admission-test-2019/");
            }

            else if(option.equals("BSMRSTUAdmission")){
                    webView.loadUrl("https://www.admission.bsmrstu.edu.bd/b/admission/");
            }

            else if(option.equals("RMSTUAdmission")){
                    webView.loadUrl("https://rmstu.edu.bd/admission-circular-2018-2019/");
            }

            else if(option.equals("BSMRMUAdmission")){
                    webView.loadUrl("https://www.bsmrmu.edu.bd/admission-notice.php");
            }

            else if(option.equals("RMUAdmission")){
                    webView.loadUrl("https://www.rmu.edu.bd/admission/");
            }

            else if(option.equals("CMUAdmission")){
                    webView.loadUrl("http://www.cmu.edu.bd/");
            }

            else if(option.equals("RUBAdmission")){
                    webView.loadUrl("http://rub.ac.bd/onlineadmission.html");
            }

            else if(option.equals("BDUAdmission")){
                    webView.loadUrl("https://bdu.ac.bd/admission");
            }

            else if(option.equals("SHUAdmission")){
                    webView.loadUrl("https://allresultbd.com/shu-admission-circular/");
            }

            else if(option.equals("BSFMSTUAdmission")){
                    webView.loadUrl("https://bsfmstu.ac.bd/admission/");
            }

            else if(option.equals("SMUAdmission")){
                    webView.loadUrl("http://magosmanimedical.com/admission/");
            }

            else if(option.equals("KAUAdmission")){
                    webView.loadUrl("https://admission-agri.org/");
            }

            ///INFO
            else if(option.equals("DUINFO")){
              webView.loadUrl("https://www.du.ac.bd/");
            }

            else if(option.equals("RUINFO")){
                    webView.loadUrl("http://www.ru.ac.bd/");
            }

            else if(option.equals("BAUINFO")){
                    webView.loadUrl("https://www.bau.edu.bd/");
            }

            else if(option.equals("BUETINFO")){
                    webView.loadUrl("https://www.buet.ac.bd/");
            }

            else if(option.equals("CUINFO")){
                    webView.loadUrl("http://cu.ac.bd/");
            }

            else if(option.equals("JUINFO")){
                    webView.loadUrl("http://www.juniv.edu/");
            }

            else if(option.equals("IUINFO")){
                    webView.loadUrl("https://www.iu.ac.bd/");
            }

            else if(option.equals("SUSTINFO")){
                    webView.loadUrl("https://www.sust.edu/");
            }

            else if(option.equals("KUINFO")){
                    webView.loadUrl("https://ku.ac.bd/");
            }

            else if(option.equals("BSMMUINFO")){
                    webView.loadUrl("https://ku.ac.bd/");
            }

            else if(option.equals("BSMRAUINFO")){
                    webView.loadUrl("https://bsmrau.edu.bd/");
            }

            else if(option.equals("HSTUINFO")){
                    webView.loadUrl("https://www.hstu.ac.bd/");
            }

            else if(option.equals("MBSTUINFO")){
                    webView.loadUrl("https://mbstu.ac.bd/admission.html");
            }

            else if(option.equals("PSTUINFO")){
                    webView.loadUrl("https://www.pstu.ac.bd/");
            }

            else if(option.equals("SAUINFO")){
                    webView.loadUrl("http://www.sau.edu.bd/");
            }

            else if(option.equals("DUETINFO")){
                    webView.loadUrl("http://www.duet.ac.bd/");
            }

            else if(option.equals("RUETINFO")){
                    webView.loadUrl("http://www.ruet.ac.bd/");
            }

            else if(option.equals("CUETINFO")){
                    webView.loadUrl("http://www.cuet.ac.bd/");
            }

            else if(option.equals("KUETINFO")){
                    webView.loadUrl("http://www.kuet.ac.bd/");
            }

            else if(option.equals("JNUINFO")){
                    webView.loadUrl("https://www.jnu.ac.bd/");
            }

            else if(option.equals("JKNNIUINFO")){
                    webView.loadUrl("https://jkkniu.edu.bd/");
            }

            else if(option.equals("CVASUINFO")){
                    webView.loadUrl("http://cvasu.ac.bd/");
            }

            else if(option.equals("StAUINFO")){
                    webView.loadUrl("http://www.sau.ac.bd/");
            }

            else if(option.equals("CoUINFO")){
                    webView.loadUrl("https://www.cou.ac.bd/");
            }

            else if(option.equals("NSTUINFO")){
                    webView.loadUrl("https://nstu.edu.bd/");
            }

            else if(option.equals("JUSTINFO")){
                    webView.loadUrl("https://just.edu.bd/");
            }

            else if(option.equals("PUSTINFO")){
                    webView.loadUrl("https://www.pust.ac.bd/");
            }

            else if(option.equals("BUPINFO")){
                    webView.loadUrl("https://bup.edu.bd/");
            }

            else if(option.equals("BRUINFO")){
                    webView.loadUrl("https://brur.ac.bd/");
            }

            else if(option.equals("BUTexINFO")){
                    webView.loadUrl("https://www.butex.edu.bd/");
            }

            else if(option.equals("BSMRSTUINFO")){
                    webView.loadUrl("https://www.bsmrstu.edu.bd/s/");
            }

            else if(option.equals("RMSTUINFO")){
                    webView.loadUrl("https://rmstu.edu.bd/");
            }

            else if(option.equals("BSMRMUINFO")){
                    webView.loadUrl("https://www.bsmrmu.edu.bd/");
            }

            else if(option.equals("RMUINFO")){
                    webView.loadUrl("https://www.rmu.edu.bd/");
            }

            else if(option.equals("CMUINFO")){
                    webView.loadUrl("http://www.cmu.edu.bd/");
            }

            else if(option.equals("RUBINFO")){
                    webView.loadUrl("https://www.rub.ac.bd/");
            }

            else if(option.equals("BDUINFO")){
                    webView.loadUrl("https://bdu.ac.bd/");
            }

            else if(option.equals("SHUINFO")){
                    webView.loadUrl("http://shu.edu.bd/");
            }

            else if(option.equals("BSFMSTUAINFO")){
                    webView.loadUrl("https://bsfmstu.ac.bd/");
            }

            else if(option.equals("SMUINFO")){
                    webView.loadUrl("https://www.smu.edu.bd/");
            }

            else if(option.equals("KAUINFO")){
                    webView.loadUrl("http://www.kau.edu.bd/");
            }
    }
}