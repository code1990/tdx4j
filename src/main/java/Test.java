import java.io.*;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.print(11);
        File file = new File("D:\\BaiduNetdiskDownload\\new_jyexp V7.50_20200521-0530纯净版\\vipdoc\\sz\\lday\\sz002569.day");
        BufferedReader in = new BufferedReader(new InputStreamReader( new FileInputStream(file), "GBK"));
        String s = null;in.readLine();
//            System.out.println(s);
//            s = in.readLine();
            while ((s=in.readLine()) != null) {
                System.out.println(s);
//
//                results = s.split("\t");
//                for (int x = 0; x < results.length; x++)
//                    System.out.println(results[x]);
//                stockid.setRq(new SimpleDateFormat("MM/dd/yyy").parse(results[0]) );
//
//                ;
//
//                stockid.setOpen(Double.parseDouble(results[1]));
//                stockid.setHigh(Double.parseDouble(results[2]));
//                stockid.setLow(Double.parseDouble(results[3]));
//                stockid.setEnd(Double.parseDouble(results[4]));
//                stockid.setDealnum(Long.parseLong(results[5]));
//                stockid.setDealAmt(Double.parseDouble(results[6]));
//                stock.setId(stockid);
////                dao.save(stock);
//
            }
    }

//    public void readStockDay(String File) {
//        String s = null;
//        int sum = 0;
//
//        StockId stockid=new StockId();
//        Stock stock=null;
//        stock = new Stock();
//        try {
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                    new FileInputStream(File), "GBK"));
//
//            s = in.readLine();
//            System.out.println(s);
//            stockid.setId(s);
//            s = in.readLine();
//            while ((s=in.readLine()) != null) {
//
//                results = s.split("\t");
//                for (int x = 0; x < results.length; x++)
//                    System.out.println(results[x]);
//                stockid.setRq(new SimpleDateFormat("MM/dd/yyy").parse(results[0]) );
//
//                ;
//
//                stockid.setOpen(Double.parseDouble(results[1]));
//                stockid.setHigh(Double.parseDouble(results[2]));
//                stockid.setLow(Double.parseDouble(results[3]));
//                stockid.setEnd(Double.parseDouble(results[4]));
//                stockid.setDealnum(Long.parseLong(results[5]));
//                stockid.setDealAmt(Double.parseDouble(results[6]));
//                stock.setId(stockid);
////                dao.save(stock);
//
//            }
//
//
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public   boolean readfile() throws FileNotFoundException, IOException {
        return true;// readfile(getFileName());
    }

    public static boolean readfile(String filepath)  throws FileNotFoundException, IOException {
        try {
            String absfilename = null;

            File file = new File(filepath);
            if (!file.isDirectory()) {
                System.out.println("文件");
                System.out.println("path=" + file.getPath());
                System.out.println("absolutepath=" + file.getAbsolutePath());
                System.out.println("name=" + file.getName());

            } else if (file.isDirectory()) {
                System.out.println("文件夹");

                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File readfile = new File(filepath + "\\" + filelist[i]);
                    if (!readfile.isDirectory()) {
                        System.out.println("path=" + readfile.getPath());
                        System.out.println("absolutepath="
                                + readfile.getAbsolutePath());
                        System.out.println("name=" + readfile.getName());
                        absfilename = readfile.getAbsolutePath();
                    } else if (readfile.isDirectory()) {
                        readfile(filepath + "\\" + filelist[i]);
                    }
                    // TO Do
//                    mc.readStockDay(absfilename);

                    //
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("readfile()   Exception:" + e.getMessage());
        }
        return true;
    }
}
class StockId{
    private double open;
    private double high;
    private double low;
    private double end;
    private double dealnum;
    private double dealAmt;
//    stock.setId(stockid);


    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public double getDealnum() {
        return dealnum;
    }

    public void setDealnum(double dealnum) {
        this.dealnum = dealnum;
    }

    public double getDealAmt() {
        return dealAmt;
    }

    public void setDealAmt(double dealAmt) {
        this.dealAmt = dealAmt;
    }
}