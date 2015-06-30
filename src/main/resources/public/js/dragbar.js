$(document).ready(function() {
  var i = 0;
   $('#dragbar').mousedown(function(e){
        e.preventDefault();
        $('#mousestatus').html("mousedown" + i++);
        $(document).mousemove(function(e){
          $('#position').html(e.pageX +', '+ e.pageY);
          $('#sidebar').css("width",e.pageX+2);
          $('#main').css("left",e.pageX+2);
       });
       console.log("leaving mouseDown");
    });
   $(document).mouseup(function(e){
       $('#clickevent').html('in another mouseUp event' + i++);
       $(document).unbind('mousemove');
       });
});