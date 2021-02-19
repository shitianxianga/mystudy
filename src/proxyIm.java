public class proxyIm implements proxyIn{
    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void goodbye() {
        System.out.println("goodbye");
    }
}
