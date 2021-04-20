package day0406interface.iphone;

public  class NewIPhone extends IPhone implements Internet,Movies,Music,Photo {

    @Override
    void kind() {
        System.out.println("型号是：S81的西门子手机");
    }
    void kindNew() {
        System.out.println("型号是：P48的华为手机");
    }
    @Override
    void call() {
        System.out.println("打电话");
    }

    @Override
    void note() {
        System.out.println("发短信");
    }

    @Override
    public void web() {
        System.out.println("已经启动网络");
    }

    @Override
    public void see() {
        System.out.println("开始播放视频，《明日之子》");
    }

    @Override
    public void listen() {
        System.out.println("听音乐");
    }

    @Override
    public void tablePhoto() {
        System.out.println("卡兹，拍照成功");
    }
}
