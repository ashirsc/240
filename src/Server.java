public class Server {

    public static void main(String[] args) {

        Server server = new Server();
        server.start();
        server.run();
    }

    void start() {

        Generator generator = new Generator();
    }

    void run() {

        String port = "8080";
    }

}
