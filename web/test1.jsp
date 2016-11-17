<html>
    <head>
        <script type="text/javascript">

            var nesne;
            if (navigator.appName.search('Microsoft') > -1) {
                nesne = new ActiveXObject('MSXML2.XMLHTTP');
            }
            else {
                nesne = new XMLHttpRequest();
            }

            function yolla() {
                nesne.open('get', 'Questions\\myText.txt', true);
                nesne.onreadystatechange = cevap;
                nesne.send(null);
            }

            function cevap() {
                if (nesne.readyState == 4) {
                    var el = document.getElementById('bilgi');
                    el.innerHTML = nesne.responseText;
                }
            }

        </script>
    </head>
    <body>
        <input type="button" value=""  onclick="yolla()">

        <div id="bilgi"></div>

    </body>
</html>