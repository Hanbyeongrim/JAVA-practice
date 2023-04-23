package singleton;

public class SocketClient {
    private static SocketClient socketClient = null; // 자기자신을 객체로 갖고 있어야 함
    private SocketClient(){ //기본생성자를 막아야 함

    }
    public static SocketClient getInstance(){
        if(socketClient == null){
           socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
