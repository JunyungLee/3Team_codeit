import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchService {

    private List<String> users;

    public SearchService() {
        this.users = new ArrayList<>();
        // 유저 예시
        users.add("Alice Johnson");
        users.add("Bob Smith");
        users.add("Charlie Brown");
        users.add("Diana Prince");
        users.add("Elliot Alderson");
    }

    public List<String> searchUsers(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            return new ArrayList<>();
        }

        return users.stream()
                .filter(user -> user.toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SearchService searchService = new SearchService();

        // 검색 예시
        String keyword = "ali";
        List<String> results = searchService.searchUsers(keyword);

        // 결과 출력
        if (results.isEmpty()) {
            System.out.println("해당 키워드로 검색된 사용자가 없습니다. : " + keyword);
        } else {
            System.out.println("검색된 유저 :");
            results.forEach(System.out::println);
        }
    }
}
