var fun1 = function (name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};


var fun2 = function (object) {
  print("JS Class Definition: " + object);
};

var myJavaClass = Java.type('my.package.MyJavaClass');
var result = myJavaClass.fun1("Joho Doe");
print(result);