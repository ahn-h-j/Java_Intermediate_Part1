package exception.ex3;

import exception.ex2.NetworkClientExceptionV2;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data);
        }catch (ConnectExceptionV3 e) {
//        }catch (ConnectExceptionV3 | SendExceptionV3 e)
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        }finally {
            client.disconnect();
        }

    }
}