package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV0 networkClientV0 = new NetworkClientV0(address);


        networkClientV0.connect();
        networkClientV0.send(data);
        networkClientV0.disconnect();
    }
}
