import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class TDX {
    public static String path ="D:\\BaiduNetdiskDownload\\new_jyexp V7.50_20200521-0530纯净版\\vipdoc\\sz\\lday\\sz002569.day";
    public static void main(String[] args) {
        File file = new File(path);
//        BinaryReader br = new BinaryReader(file);
//        System.out.println();
//        System.out.println(br.toString());
        readFile(path);
    }


    public static void readFile(String fileName){


        File file = new File(fileName);
        if(file.exists()){
            try {
                FileInputStream in = new FileInputStream(file);
                DataInputStream dis=new DataInputStream(in);

                byte[] itemBuf = new byte[64];
                //市场编码
                dis.read(itemBuf, 0, 8);
                String marketID =new String(itemBuf,0,8);

                //市场名称
                dis.read(itemBuf, 0, 20);//read方法读取一定长度之后，被读取的数据就从流中去掉了，所以下次读取仍然从 0开始
                String marketName =new String(itemBuf,0,20);

                //上一交易日日期
                dis.read(itemBuf, 0, 8);
                String lastTradingDay = new String(itemBuf,0,8);

                //当前交易日日期
                dis.read(itemBuf, 0, 8);
                String curTradingDay = new String(itemBuf,0,8);

                //交易状态
                dis.read(itemBuf, 0, 1);
                String marketStatus = new String(itemBuf,0,1);

                //交易时段数
                short tradePeriodNum = dis.readShort();

                System.out.println("市场代码:"+ marketID);
                System.out.println("市场名称:"+ marketName);
                System.out.println("上一交易日日期:"+ lastTradingDay);
                System.out.println("当前交易日日期:"+ curTradingDay);
                System.out.println("当前交易日日期:"+ curTradingDay);
                System.out.println("交易状态:"+ marketStatus);
                System.out.println("交易时段数:"+ tradePeriodNum);

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally{
                //close
            }
        }
    }

//    public List<StockInfo> GetStockInfo(String code) throws Exception{
//        FileInputStream fs = new FileInputStream(new File(path));
//        File file = new File(path);
//        BinaryReader br = new BinaryReader(file);
//        int days = (int)fs.Length / 32;
//        List<StockInfo> list = new List<StockInfo>();
//        for (int i = 0; i < days; i++)
//        {
//            StockInfo item = new StockInfo();
//            //item.DataDate =DateTime.Parse(new string(br.ReadChars(8)));
//            int date = br.ReadInt32();
//            int year = date / 10000;
//            int month = int.Parse(date.ToString().Substring(4, 2));
//            int day = int.Parse(date.ToString().Substring(6, 2));
//            int open = br.ReadInt32();
//            int high = br.ReadInt32();
//            int low = br.ReadInt32();
//            int close = br.ReadInt32();
//            Single amount = br.ReadSingle();
//            //Int32 amount = br.ReadInt32();
//            decimal am = Convert.ToDecimal(amount);
//            long amstr = Convert.ToInt64(amount);
//            int vol = br.ReadInt32();
//            int preclose = br.ReadInt32();
//
//
//            //Decimal open = Convert.ToDecimal(br.ReadSingle());
//            item.Date = new DateTime(year, month, day);
//            item.Open = Convert.ToDecimal(open / 100m);
//            item.High = Convert.ToDecimal(high / 100m);
//            item.Low = Convert.ToDecimal(low / 100m);
//            item.Close = Convert.ToDecimal(close / 100m);
//            item.Amount = amstr;
//            item.Vol = vol;
//
//            list.Add(item);
//        }
//        br.Close();
//        fs.Close();
//        return list;
//    }


}
