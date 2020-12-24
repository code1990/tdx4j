import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class StockInfo {
    // 日K线数据结构
    public Date date;   // e.g. 20100304
    public BigDecimal open;           // *0.01 开盘价
    public BigDecimal high;           // *0.01 最高价
    public BigDecimal low;            // *0.01 最低价
    public BigDecimal close;          // *0.01 收盘价
    public BigDecimal amount;        // 成交额
    public BigInteger vol;             // 成交量(手)

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigInteger getVol() {
        return vol;
    }

    public void setVol(BigInteger vol) {
        this.vol = vol;
    }
}
