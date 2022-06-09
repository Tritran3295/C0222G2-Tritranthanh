<%--
  Created by IntelliJ IDEA.
  User: Laptop T&T
  Date: 6/5/2022
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<center>
    <h3>Add New Customer</h3>
</center>
<div align="center">
    <table border="1">
        <th>Id Customer</th>
        <th>Name Customer</th>
        <th>Day of birth</th>
        <th>Gender</th>
        <th>Id Card Customer</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Type of Customer</th>
    </table>
    <c:forEach var="temp" items="customer"

<nav class="fixed-top navbar navbar-light nav-inverse  navbar-expand moodle-has-zindex p-0 greedy" aria-label="Site navigation">
    <div class="navbar-brand navbar-brand-center p-0 m-0 h-100">

        <a class="text-white d-flex align-items-center justify-content-center h-100 w-full text-decoration-none" href="https://james.codegym.vn">
                <span class="navbar-brand-logo mini" style="background-image: url(//james.codegym.vn/pluginfile.php/1/theme_remui/logomini/1637071366/icon-small.png);
                    background-position: center; background-size: contain; background-repeat: no-repeat;"></span>
            <span class="navbar-brand-logo" style="background-image: url(//james.codegym.vn/pluginfile.php/1/theme_remui/logo/1637071366/Codegym%20X.png);
                    background-position: center; background-size: contain; background-repeat: no-repeat;">
                </span>
        </a>
    </div>
    <div data-region="drawer-toggle" class="d-inline-block m-0 h-100">
        <button aria-expanded="true" aria-controls="nav-drawer" type="button" class="btn nav-link float-sm-left  bg-transparent" data-action="toggle-drawer" data-side="left" data-preference="drawer-open-nav"><i class="icon fa fa-bars fa-fw " aria-hidden="true"></i><span class="sr-only">Side panel</span></button>
    </div>
    <div class="nav-item" id="toggleFullscreen" title="Toggle fullscreen">
        <a class="nav-link icon m-0 px-3" data-toggle="fullscreen" href="#" role="button">
            <svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="expand" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-expand fa-w-14 fa-3x"><path fill="currentColor" d="M0 180V56c0-13.3 10.7-24 24-24h124c6.6 0 12 5.4 12 12v40c0 6.6-5.4 12-12 12H64v84c0 6.6-5.4 12-12 12H12c-6.6 0-12-5.4-12-12zM288 44v40c0 6.6 5.4 12 12 12h84v84c0 6.6 5.4 12 12 12h40c6.6 0 12-5.4 12-12V56c0-13.3-10.7-24-24-24H300c-6.6 0-12 5.4-12 12zm148 276h-40c-6.6 0-12 5.4-12 12v84h-84c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h124c13.3 0 24-10.7 24-24V332c0-6.6-5.4-12-12-12zM160 468v-40c0-6.6-5.4-12-12-12H64v-84c0-6.6-5.4-12-12-12H12c-6.6 0-12 5.4-12 12v124c0 13.3 10.7 24 24 24h124c6.6 0 12-5.4 12-12z" class=""></path></svg>
            <svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="compress" role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512" class="svg-inline--fa fa-compress fa-w-14 fa-3x"><path fill="currentColor" d="M436 192H312c-13.3 0-24-10.7-24-24V44c0-6.6 5.4-12 12-12h40c6.6 0 12 5.4 12 12v84h84c6.6 0 12 5.4 12 12v40c0 6.6-5.4 12-12 12zm-276-24V44c0-6.6-5.4-12-12-12h-40c-6.6 0-12 5.4-12 12v84H12c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h124c13.3 0 24-10.7 24-24zm0 300V344c0-13.3-10.7-24-24-24H12c-6.6 0-12 5.4-12 12v40c0 6.6 5.4 12 12 12h84v84c0 6.6 5.4 12 12 12h40c6.6 0 12-5.4 12-12zm192 0v-84h84c6.6 0 12-5.4 12-12v-40c0-6.6-5.4-12-12-12H312c-13.3 0-24 10.7-24 24v124c0 6.6 5.4 12 12 12h40c6.6 0 12-5.4 12-12z" class=""></path></svg>
        </a>
    </div>

    <div class="nav-item dropdown outer d-none" id="recentCourses">
        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="javascript:void(0)" data-animation="scale-up" aria-expanded="true" role="button">Recent</a>
        <div class="dropdown-menu" role="menu">
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=545"><div class="text_to_html">[BC-JAVA-JWBD] Java Web Back-end Development 2.1</div></a>
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=79"><div class="text_to_html">[BC-JAVA-JWBD] Java Web Back-end Development 2.0</div></a>
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=62"><div class="text_to_html">Bootcamp Preparation 2.0</div></a>
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=572"><div class="text_to_html">Bootcamp Preparation 2.1</div></a>
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=541"><div class="text_to_html">[BC-JAVA-APJ] Advanced Programming with Java 2.1</div></a>
        </div>
    </div>

    <ul class="navbar-nav h-100 wdm-custom-menus links">
        <li class="nav-item dropdown" id="recentCourses">
            <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="javascript:void(0)" data-animation="scale-up" aria-expanded="true" role="button">Recent</a>
            <div class="dropdown-menu" role="menu">
                <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=545"><div class="text_to_html">[BC-JAVA-JWBD] Java Web Back-end Development 2.1</div></a>
                <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=79"><div class="text_to_html">[BC-JAVA-JWBD] Java Web Back-end Development 2.0</div></a>
                <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=62"><div class="text_to_html">Bootcamp Preparation 2.0</div></a>
                <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=572"><div class="text_to_html">Bootcamp Preparation 2.1</div></a>
                <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/course/view.php?id=541"><div class="text_to_html">[BC-JAVA-APJ] Advanced Programming with Java 2.1</div></a>
            </div>
        </li>
        <!-- custom_menu -->
        <li class="dropdown nav-item">
            <a class="dropdown-toggle nav-link" id="drop-down-629d93eff3da4629d93efcb0c46" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="#" aria-controls="drop-down-menu-629d93eff3da4629d93efcb0c46">
                Hệ thống CodeGym
            </a>
            <div class="dropdown-menu" role="menu" id="drop-down-menu-629d93eff3da4629d93efcb0c46" aria-labelledby="drop-down-629d93eff3da4629d93efcb0c46">
                <a class="dropdown-item" role="menuitem" href="https://andy.codegym.vn " target="_blank">CodeGym SIS</a>
                <a class="dropdown-item" role="menuitem" href="http://ken.codegym.vn " target="_blank">CodeGym Projects</a>
                <a class="dropdown-item" role="menuitem" href="http://bob.codegym.vn " target="_blank">CodeGym Bob</a>
            </div>
        </li><li class="dropdown nav-item">
        <a class="dropdown-toggle nav-link" id="drop-down-629d93eff3e64629d93efcb0c47" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" href="#" title="Language" aria-controls="drop-down-menu-629d93eff3e64629d93efcb0c47">
            English ‎(en)‎
        </a>
        <div class="dropdown-menu" role="menu" id="drop-down-menu-629d93eff3e64629d93efcb0c47" aria-labelledby="drop-down-629d93eff3e64629d93efcb0c47">
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/mod/assign/view.php?id=10074&amp;rownum=0&amp;useridlistid=629d93efb1e53194247661&amp;action&amp;lang=en" title="English ‎(en)‎">English ‎(en)‎</a>
            <a class="dropdown-item" role="menuitem" href="https://james.codegym.vn/mod/assign/view.php?id=10074&amp;rownum=0&amp;useridlistid=629d93efb1e53194247661&amp;action&amp;lang=vi" title="Vietnamese ‎(vi)‎">Vietnamese ‎(vi)‎</a>
        </div>
    </li>
        <!-- page_heading_menu -->

    </ul>

    <!-- collapsible menu -->
    <button class="menu-toggle hidden" count="0"><span><i class="fa fa-ellipsis-h" aria-hidden="true"></i></span></button>
    <ul class="hidden-links hidden"></ul>

    <!-- login menu toggler on mobile -->
    <button type="button" class="navbar-toggler">
        <i class="icon fa fa-ellipsis-v" aria-hidden="true"></i>
    </button>

    <ul class="nav navbar-nav ml-auto mr-2 h-100 right-menu justify-content-end">
        <div class="d-none d-lg-block">
            <div class="search-input-wrapper nav-link" id="629d93eff3f1c"><div role="button" tabindex="0"><i class="icon fa fa-search fa-fw " title="Search" aria-label="Search"></i></div><form class="search-input-form" action="https://james.codegym.vn/search/index.php"><label for="id_q_629d93eff3f1c" class="accesshide">Enter your search query</label><input type="text" name="q" placeholder="Search" size="13" tabindex="-1" id="id_q_629d93eff3f1c" class="form-control"><input type="hidden" name="context" value="50382"></form></div>
        </div>
        <!-- navbar_plugin_output : 'message', 'notifications' and 'chat sidebar' toggles -->
        <li class="nav-item">
            <div class="popover-region collapsed popover-region-notifications nav-item m-0 dropdown" id="nav-notification-popover-container" data-userid="5721" data-region="popover-region">
                <div class="popover-region-toggle nav-link" data-toggle="dropdown" data-region="popover-region-toggle" aria-role="button" aria-controls="popover-region-container-629d93f000a2b629d93efcb0c48" aria-haspopup="true" aria-label="Show notification window with no new notifications" tabindex="0">
                    <i class="icon fa fa-bell fa-fw " title="Toggle notifications menu" aria-label="Toggle notifications menu"></i>
                    <div class="count-container hidden" data-region="count-container" aria-label="There are 0 unread notifications">0</div>

                </div>
                <div id="popover-region-container-629d93f000a2b629d93efcb0c48" class="dropdown-menu dropdown-menu-right dropdown-menu-media p-0" data-region="popover-region-container" aria-expanded="false" aria-hidden="true" aria-label="Notification window" role="region">
                    <div class="popover-region-header-container d-flex h-auto p-3 justify-content-between">
                        <h3 class="popover-region-header-text" data-region="popover-region-header-text">Notifications</h3>
                        <div class="popover-region-header-actions" data-region="popover-region-header-actions">        <a class="mark-all-read-button" href="#" title="Mark all as read" data-action="mark-all-read" role="button">
                            <span class="normal-icon"><i class="icon fa fa-check fa-fw " title="Mark all as read" aria-label="Mark all as read"></i></span>
                            <span class="loading-icon icon-no-margin"><i class="icon fa fa-circle-o-notch fa-spin fa-fw " title="Loading" aria-label="Loading"></i></span>
                        </a>
                            <a href="https://james.codegym.vn/message/notificationpreferences.php?userid=5721" title="Notification preferences">
                                <i class="icon fa fa-cog fa-fw " title="Notification preferences" aria-label="Notification preferences"></i>
                            </a>
                        </div>
                    </div>
                    <div class="popover-region-content-container" style="min-height: 200px;" data-region="popover-region-content-container">
                        <div class="popover-region-content" data-region="popover-region-content">
                            <div class="all-notifications" data-region="all-notifications" role="log" aria-busy="false" aria-atomic="false" aria-relevant="additions"></div>
                            <div class="empty-message" tabindex="0" data-region="empty-message">You have no notifications</div>

                        </div>
                        <span class="loading-icon icon-no-margin"><i class="icon fa fa-circle-o-notch fa-spin fa-fw " title="Loading" aria-label="Loading"></i></span>
                    </div>
                    <a class="see-all-link d-flex p-2 justify-content-center border-top" href="https://james.codegym.vn/message/output/popup/notifications.php">
                        <div class="popover-region-footer-container border-0">
                            <div class="popover-region-seeall-text">See all</div>
                        </div>
                    </a>
                </div>
            </div></li><li class="popover-region nav-item collapsed text-center m-0">
        <a id="message-drawer-toggle-629d93efcf485629d93efcb0c42" class="nav-link popover-region-toggle p-3" data-toggle="tab" href="#sidebar-message" role="tab" aria-selected="false" data-placement="top" data-original-title="Toggle messaging drawer">
            <i class="icon fa fa-comment" aria-hidden="true"></i>
            <span class="wdm-msg-count font-size-10 badge badge-danger up animation-shake hidden" data-region="count-container">0</span>
        </a>
    </li>

        <!-- user_menu -->
        <li class="nav-item d-flex align-items-center">
            <div class="usermenu nav-item dropdown user-menu login-menu"><a class="nav-link navbar-avatar" data-toggle="dropdown" href="#" aria-expanded="false" data-animation="scale-up" role="button">
                <span class="username pr-1">Trần Thanh Trí</span>
                <span class="avatar avatar-online current">
            <img src="https://james.codegym.vn/theme/image.php/remui/core/1637071366/u/f2" class="userpicture defaultuserpic" width="35" height="35" aria-hidden="true">
            <i style="border-color: white;"></i>
            </span>
            </a><div class="dropdown-menu  dropdown-menu-right" role="menu"><a class="dropdown-item" href="https://james.codegym.vn/my/" role="menuitem"><i class="icon fa fa-tachometer fa-fw iconsmall" aria-hidden="true" title="Dashboard"></i>Dashboard</a><div class="dropdown-divider" role="presentation"></div><a class="dropdown-item" href="https://james.codegym.vn/user/profile.php?id=5721" role="menuitem"><i class="icon fa fa-user fa-fw iconsmall" aria-hidden="true" title="Profile"></i>Profile</a><a class="dropdown-item" href="https://james.codegym.vn/grade/report/overview/index.php" role="menuitem"><i class="icon fa fa-table fa-fw iconsmall" aria-hidden="true" title="Grades"></i>Grades</a><a class="dropdown-item" href="https://james.codegym.vn/message/index.php" role="menuitem"><i class="icon fa fa-comment fa-fw iconsmall" aria-hidden="true" title="Messages"></i>Messages</a><a class="dropdown-item" href="https://james.codegym.vn/user/preferences.php" role="menuitem"><i class="icon fa fa-wrench fa-fw iconsmall" aria-hidden="true" title="Preferences"></i>Preferences</a><div class="dropdown-divider" role="presentation"></div><a class="dropdown-item" href="https://james.codegym.vn/login/logout.php?sesskey=bVQymtVuDq" role="menuitem"><i class="icon fa fa-sign-out fa-fw iconsmall" aria-hidden="true" title="Log out"></i>Log out</a></div></div>
        </li>
    </ul>
    <!-- search_box -->
</nav>
</div>
<body>

</body>
</html>
