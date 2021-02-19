package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * @author shitianxiang
 * @version 1.0
 * @description
 * @updateRemark
 * @updateUser
 * @createDate 2020/12/11 9:19
 * @updateDate 2020/12/11 9:19
 **/
public class romoveHtml {
    public static String removeHtmlTag(String inputString) {
        if (inputString == null)
            return null;
        String htmlStr = inputString; // 含html标签的字符串
        String textStr = "";
        java.util.regex.Pattern p_script;
        java.util.regex.Matcher m_script;
        java.util.regex.Pattern p_style;
        java.util.regex.Matcher m_style;
        java.util.regex.Pattern p_html;
        java.util.regex.Matcher m_html;
        java.util.regex.Pattern p_special;
        java.util.regex.Matcher m_special;
        try {
//定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
//定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
// 定义HTML标签的正则表达式
            String regEx_html = "<[^>]+>";
// 定义一些特殊字符的正则表达式 如：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            String regEx_special = "\\&[a-zA-Z]{1,10};";

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签
            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll(""); // 过滤style标签
            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
            m_html = p_html.matcher(htmlStr);
            htmlStr = m_html.replaceAll(""); // 过滤html标签
            p_special = Pattern.compile(regEx_special, Pattern.CASE_INSENSITIVE);
            m_special = p_special.matcher(htmlStr);
            htmlStr = m_special.replaceAll(""); // 过滤特殊标签
            textStr = htmlStr;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return textStr;// 返回文本字符串
    }

    /*
     * 测试用的main函数
     * @param args
     */
    public static void main(String[] args) {
        String sb="<p class=\"p17\">**《浑厚华滋——黄宾虹艺术论》，刊于胡萍总主编《笔墨传承&nbsp;&nbsp;张立辰教学四十年文献&nbsp;&nbsp;南北名师中国画讲演录》，高等教育出版社，2013年9月。**</p>**<p class=\"p17\">**《造险破险——潘天寿艺术论》，刊于胡萍总主编《笔墨传承&nbsp;&nbsp;张立辰教学四十年文献&nbsp;&nbsp;南北名师中国画讲演录》，高等教育出版社，2013年9月。**</p>**<p class=\"p17\">**《自然而然——齐白石艺术论》，刊于胡萍总主编《笔墨传承&nbsp;&nbsp;张立辰教学四十年文献&nbsp;&nbsp;南北名师中国画讲演录》，高等教育出版社，2013年9月。**</p>**<p class=\"p0\">**《失范的市场就有失衡的价格》，刊于《中国画画刊》，2013年2期。**</p>**<p class=\"p0\">**《夯实基础&nbsp;循序渐进——中国思想与绘画学科方向的新成果》，刊于《中国思想与绘画教学和研究集（二）》，金观涛，毛建波主编。中国美术学院出版社，2013年4月。**</p>**<p class=\"p0\">**《中国思想与绘画教学和研究集（二）》，金观涛，毛建波主编。中国美术学院出版社，2013年4月。**</p>**<p class=\"p0\">**《高简纯净&nbsp;浑朴静穆——顾生岳艺术论》，《美术》杂志，2012，12期。**</p>**<p class=\"p0\">**《余绍宋与杭州画坛》，收入西泠印社艺术品鉴定评估中心编《中国现代绘画艺术国际学术探讨会论文集》，西泠印社出版社<span>2012</span><span>，</span><span>10</span><span>。</span> **</p>**<p class=\"p0\">**《暝心玄化&nbsp;&nbsp;&nbsp;造化在手——马锋辉写生图集序》，刊于《马锋辉水墨写生五十图集》，上海书画出版社，2012年9月。**</p>**<p class=\"p0\">**《中国思想与绘画教学与研究集（一）》&nbsp;&nbsp;金观涛、毛建波主编，中国美术学院出版社，<span>2012</span><span>年</span><span>3</span><span>月。</span> **</p>**<p class=\"p0\">**《张雨在杭活动及其书法创作》，李治安、宋涛主编《马可波罗游历过的城市——Quinsay&nbsp;元代杭州研究文集》，杭州出版社，2012年5月。**</p>**<p class=\"p0\">**《笔落惊风雨——王冬龄大字草书的文化价值》，载许江主编《书法道——王冬龄书法艺术》，上海书画出版社，2011年10月。**</p>**<p class=\"p0\">**《兼容并包&nbsp;独创新机——任伯年绘画论》，《画刊》<span>2011</span> **</p>**<p class=\"p0\">**《绍续风流——湖州丹青百年谱》，载沈新康主编《百年丹青——湖州十家书画精品集》，西泠印社出版社，2011年６月。**</p>**<p class=\"p0\">**《派自有源&nbsp;后继有成》，载潘雪敏主编《挥洒与飞跃——中国当代名家作品集》，珠江文艺出版社，2011年1月。**</p>**<p style=\"text-align:justify;\" class=\"p16\">**《当代社会情境变迁与书法高端人才培育》，收入《2010杭州国际高等书法教育论坛论文集》，祝遂之主编，中国美术学院出版社出版，2010年12月。**</p>**<p class=\"p0\">**《原创者的足迹――浙派人物画开山李震坚》，收入浙江省文史研究馆编《传承·发展：浙派人物画文集》，中国美术学院出版社，<span>2010</span><span>年</span><span>10</span><span>月。</span> **</p>**<p class=\"p0\">**《史官文化传统与国家重大历史题材美术创作工程》，收入《国家重大历史题材美术创作工程理论文集》，国家重大历史题材美术创作工程办公室、美术观察杂志社编，文化艺术出版社，<span>2010</span><span>年。</span> **</p>**<p class=\"p0\">**《山水养性&nbsp;学术铸魂——西泠书画院建院三十周年庆》，收入《写意江南——西泠书画院成立三十周年书画作品集》&nbsp;，中国美术学院出版社，2009年4月。**</p>**<p style=\"margin-left:5.25pt;\" class=\"p0\">**《以复古为创新——论余绍宋的书画实践》，刊于《荣宝斋》2009年第6期。**</p>**<p class=\"p0\">**《格物致知——南北?工笔画对话学术展高峰论坛论文选》，主编，中国美术学院出版社2009年12月出版。**</p>**<p class=\"p0\">**《＜山静居画论＞校注》，主编，西泠印社出版社2009年12月出版。《厚重古朴&nbsp;凝重大气——顾生岳其人其画》，《艺术家》2008，5。**</p>**<p class=\"p0\">**论文《多元互动&nbsp;&nbsp;强势拓展（2001－2007）》，发表于《学院的力量——中国美术学院<span>30</span><span>年》，国美术学院出版社</span><span>2008</span><span>年</span><span>3</span><span>月。</span> **</p>**<p class=\"p0\">**《南田画跋》（&nbsp;校注，独立），列入《中国历代书学画论丛书》，西泠印社出版社，<span>2008</span><span>年</span><span>1</span><span>月第一版。</span> **</p>**<p class=\"p0\">**《画旨（董其昌著）》（&nbsp;校注，独立），列入《中国历代书学画论丛书》，西泠印社出版社，<span>2008</span><span>年</span><span>1</span><span>月第一版。</span> **</p>";
        sb=sb.replaceAll("<p","\n<p");
        sb=sb.replaceAll("</p>","\n");
        String ssss = romoveHtml.removeHtmlTag(sb);
        System.out.println(ssss);
    }
}
