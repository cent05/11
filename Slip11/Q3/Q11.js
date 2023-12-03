const mysql = require('mysql');

var con = mysql.createConnection(
    {
        host:"localhost",
        user:"root",
        database:"db"
    });

    con.connect(function(err)
    {
        if (err) throw err;
        console.log("connected");
        var sql = 'select * from customer';
        con.query(sql, function (err, result,fields){
            if (err) throw err;
            console.log(result);
          });
          var sql1 = "delete from customer where cid ='1'";
          con.query(sql1, function (err, result,fields){
            if (err) throw err;
            console.log(result);
          });
          con.query(sql, function (err, result,fields){
            if (err) throw err;
            console.log(result);
          });
});
