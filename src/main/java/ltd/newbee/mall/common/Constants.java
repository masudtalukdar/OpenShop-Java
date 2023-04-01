package ltd.newbee.mall.common;


public class Constants {
    //public final static String FILE_UPLOAD_DIC = "/opt/image/upload/";//The default url prefix for uploading files, which can be modified according to the deployment settings
    public final static String FILE_UPLOAD_DIC = "/upload/";//The default url prefix of the uploaded file, which can be modified according to the deployment settings

    public final static int INDEX_CAROUSEL_NUMBER = 5;////Number of carousel pictures on the home page (can be modified according to your own needs)

    public final static int INDEX_CATEGORY_NUMBER = 10;//Maximum number of first-level categories on the homepage

    public final static int SEARCH_CATEGORY_NUMBER = 8;//Maximum number of first-level categories on the search page

    public final static int INDEX_GOODS_HOT_NUMBER = 4;//The number of hot products on the home page
    public final static int INDEX_GOODS_NEW_NUMBER = 5;//Number of new products on the homepage
    public final static int INDEX_GOODS_RECOMMOND_NUMBER = 10;//The number of products recommended on the home page

    public final static int SHOPPING_CART_ITEM_TOTAL_NUMBER = 13;//The maximum number of items in the shopping cart (can be modified according to your own needs)

    public final static int SHOPPING_CART_ITEM_LIMIT_NUMBER = 5;//The maximum purchase quantity of a single item in the shopping cart (can be modified according to your own needs)

    public final static String MALL_VERIFY_CODE_KEY = "mallVerifyCode";//Verification code key

    public final static String MALL_USER_SESSION_KEY = "newBeeMallUser";//session中user的key

    public final static int GOODS_SEARCH_PAGE_LIMIT = 10;//The default number of entries in the search page (10 entries per page)

    public final static int ORDER_SEARCH_PAGE_LIMIT = 3;//The default number of items in my order list pagination (3 items per page)

    public final static int SELL_STATUS_UP = 0;//Product status
    public final static int SELL_STATUS_DOWN = 1;//Product off-shelf status

}
