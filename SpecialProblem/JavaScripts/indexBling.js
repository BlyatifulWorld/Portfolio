//Make moving image from left to right when scrolling down
$(window).on("load resize scroll", function () {
    $(".bg-static").each(function () {
        var windowTop = $(window).scrollTop();
        var elementTop = $(this).offset().top;
        var leftPosition = windowTop - elementTop;
        $(this)
            .find(".bg-move")
            .css({ left: leftPosition });
    });
});

//Make moving image from right to left when scrolling down
$(window).on("load resize scroll", function () {
    $(".bg-static2").each(function () {
        var windowTop = $(window).scrollTop();
        var elementTop = $(this).offset().top;
        var rightPosition = windowTop - elementTop;
        $(this)
            .find(".bg-move2")
            .css({ right: rightPosition });
    });
});
