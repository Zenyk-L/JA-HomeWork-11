$(document).ready(function () {
    $('.leftmenutrigger').on('click', function (e) {
        $('.side-nav').toggleClass("open");
        e.preventDefault();
    });
});

$("a.product-logout").click(
    function () {
        $.get("logout", function (data) {
            var customUrl = '';
            var urlContent = window.location.href.split('/');
            for (var i = 0; i < urlContent.length - 1; i++) {
                customUrl += urlContent[i] + '/'
            }
            if (data.destinationUrl != undefined) {
                customUrl += data.destinationUrl;
            }

            window.location = customUrl;
        });
    }
);