package aop;

import proxy.Html;
import proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    private Runnable befor;
    private Runnable after;

    public AopBrowser(String url, Runnable befor, Runnable after) {
        this.url = url;
        this.befor = befor;
        this.after = after;
    }
    @Override
    public Html show() {
        befor.run();
        if(html == null){
            this.html = new Html(url);
            System.out.println("AopBrowser html loading html from "+url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("AopBrowser cache html "+url);
        after.run();
        return html;
    }
}
