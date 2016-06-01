package android.colin.democandlechart;

import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 */
public class StockListBean {
    /**
     * error : 0
     * message :
     * content :
     */
    private int error;
    private String message;
    private List<StockBean> content;

    public void setError(int error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContent(List<StockBean> content) {
        this.content = content;
    }

    public int getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public List<StockBean> getContent() {
        return content;
    }


    class StockBean {

        /**
         * Date : 2016/4/19
         * Open : 11.78
         * High : 12.3
         * Low : 11.55
         * Close : 12.07
         * Volume : 59186200
         * Adj : 12.07
         * ma5 : 10.97
         * ma10 : 10.735
         * ma20 : 10.6785
         */

        private String Date;
        private float Open;
        private float High;
        private float Low;
        private float Close;
        private String Volume;
        private float Adj;
        private float ma5;
        private float ma10;
        private float ma20;

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
        }

        public float getOpen() {
            return Open;
        }

        public void setOpen(float open) {
            Open = open;
        }

        public float getHigh() {
            return High;
        }

        public void setHigh(float high) {
            High = high;
        }

        public float getLow() {
            return Low;
        }

        public void setLow(float low) {
            Low = low;
        }

        public float getClose() {
            return Close;
        }

        public void setClose(float close) {
            Close = close;
        }

        public String getVolume() {
            return Volume;
        }

        public void setVolume(String volume) {
            Volume = volume;
        }

        public float getAdj() {
            return Adj;
        }

        public void setAdj(float adj) {
            Adj = adj;
        }

        public float getMa5() {
            return ma5;
        }

        public void setMa5(float ma5) {
            this.ma5 = ma5;
        }

        public float getMa10() {
            return ma10;
        }

        public void setMa10(float ma10) {
            this.ma10 = ma10;
        }

        public float getMa20() {
            return ma20;
        }

        public void setMa20(float ma20) {
            this.ma20 = ma20;
        }
    }
}

