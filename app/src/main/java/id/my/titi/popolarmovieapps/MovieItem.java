package id.my.titi.popolarmovieapps;

public class MovieItem {
    String id;
    String title;
    String posterPath;
    String overview;
    String releaseDate;
    Double voteAverage;
    Double popularity;

    public MovieItem(String movieId,  String movieTitle, String moviePosterPath, String movieOverview, String movieReleaseDate, Double movieVoteAverage, Double moviePopularity) {
        id = movieId;
        title = movieTitle;
        posterPath = moviePosterPath;
        overview = movieOverview;
        releaseDate = movieReleaseDate;
        voteAverage = movieVoteAverage;
        popularity = moviePopularity;
    }
}
