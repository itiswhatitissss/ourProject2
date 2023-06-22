package com.example.ourproject.main;

import com.example.ourproject.dao.CrawlingDAO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class CrawlingMain {
    public static void main(String[] args) {
        CrawlingMain cm = new CrawlingMain();
        cm.crawling();
    }

    private void crawling() {
        CrawlingDAO dao = new CrawlingDAO();

        try {
            int k = 1;
            for(int i = 1; i<=1; i++){
                Document doc = Jsoup.connect("https://www.gmarket.co.kr/n/smilefresh/category?categoryCode=100001003&p="+i).get();
                Elements poster = doc.select("span.box__itemcard-img img.image__itemcard swiper-lazy swiper-lazy-loaded");
                System.out.println(poster);

                String image = null;

//                for(Element imgElement : poster){
//                    image = imgElement.absUrl("src");
//                    System.out.println(image);
//                }
//                if(!poster.isEmpty()){
//                    Element firstPoster = poster.first();
//                    Element imgElement = firstPoster.selectFirst("img");
//
//                    image = imgElement.attr("src");
//                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
