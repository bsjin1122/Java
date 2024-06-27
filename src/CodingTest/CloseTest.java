class CloseTest implements AutoCloseable{
    String resource;
    CloseTest(String resource){
        this.resource = resource;
    }

    @Override
    public void close() throws Exception {
        resource = null;
        System.out.println("리소스 해제");
    }
}
