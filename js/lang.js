function jsfunc() {
    // datatype();
    // control(3);
    // aArray();
    // aString();
}

function datatype() {
    var a = 0.1234567; //Number
    var b = "shit"; //String
    var c= true; //Boolean
    
    var d=[1,2,3,4,"23"]; //Array
    var e=function (x) { //Function
        return x++;
    };
    var f={ //Object
        1:"23",
        2:"333",
        "23":"234",
        "func":e
    };
    console.log(a,b,c,d,e,f);
    console.log(a.toFixed(3)); //四舍五入保留3位小数，并转换成字符串

    //类型转换使用构造函数
    a=3;
    b=4;
    console.log("整型除法：",a/b); //默认得到的结果是浮点型
}

function control(x){
    // js的控制和java一样
    if(x>3){
        console.log("x>3");
    }else if(x===3){
        console.log("x===3");
    }else{
        console.log("x<3");
    }
    switch (x) {
        case 1:
            console.log("1");
            break;
        case 2:
            console.log("2");
            break;
        default:
            console.log("else");
            break;
    }
    do{
        console.log(x);
        x++;
    }while (x<10);

    for(x=0;x<5;x++){
        console.log(x)
    }
}

function aArray() {
    var a1=[];
    for(let i=0;i<10;i++){
        a1[i]=i;
    }
    console.log(a1.length);
    var a2=[2,3,4];
    console.log(a1.concat(a2));
    console.log(a1.pop()); //删除最后一个元素
    console.log(a1.shift()); //删除第一个元素
    a1.push("s"); console.log(a1); //在末尾插入新元素
    a1.unshift(1,2,3); console.log(a1); //在头部插入元素
    a1.sort();console.log(a1); //排序
    a1.reverse();console.log(a1); //反转
    console.log(a1.slice(0,5)); //获取切片
    console.log(a1.toString()); //转换成字符串
}

function aString() {
    var s1="012345";
    console.log(s1.length);
    console.log(s1.charAt(2));
    console.log(s1.indexOf("34")); //从0开始查找，返回第一个匹配的index
    console.log(s1.indexOf("34",1)); //从index==1开始查找，返回第一个匹配的index
    console.log(s1.lastIndexOf("34"));
    console.log(s1.slice(2,5)); //截取字符串，[2,5)
    console.log(s1.substring(2,5)); //字串，[2,5)
    console.log(s1.substr(2,2)); //字串，2开始2个字符长度
    console.log(s1.split("3"));
}

/* 线程相关
1.浏览器的三个常驻线程：JS引擎、界面渲染、接收事件。三个线程是互斥的。
1.JS引擎：基于事件来执行代码，接收到事件后添加到事件队列中。在执行间隙，进行界面渲染和接收事件。

 */