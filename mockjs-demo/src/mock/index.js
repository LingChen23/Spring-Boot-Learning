//引入mockjs
import Mock from "mockjs";
//设置延迟时间
// Mock.setup({
//     timeout: 5000
// })

//使用mockjs模拟数据
Mock.mock('/product/search.*',{
    "ret": 0,
    "data":
        {
            "mtime": "@datetime",    //随机生成日期时间
            "score|1-800": 1,   //随机生成1-800数字
            "rank:1-100": 1,
            "stars|1-5": 1,
            "nickname": "@cname",   //随机生成中文名字
            //生成图片
            "img": "@image('20×10', '#ffcc33', '#FFF', 'png', 'Fast Mock')"
        }
});

