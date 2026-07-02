package SOLID;

interface recommendationStrategy{
    void recommend();
}

class TrendingRecommendation implements recommendationStrategy{
    public void recommend(){

    }
}

class GenreRecommendation implements recommendationStrategy{
    public void recommend(){

    }
}

public class DIP {
    public static void main(String[] args) {
//        TrendingRecommendation trendingRecommendation = new TrendingRecommendation();
//        trendingRecommendation.recommend();
        recommendationStrategy recommendationStrategy = new GenreRecommendation();
        recommendationStrategy.recommend();
    }
}
