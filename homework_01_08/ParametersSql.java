package homework_01_08;
import java.util.HashMap;
import java.util.Map;

public class ParametersSql {
    public static void main(String[] args) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("model", "V-60");
        parameters.put("country", "Germany");
        parameters.put("city", "Berlin");
        parameters.put("year", null);
        parameters.put("active", true);

        String sqlQuery = generateSqlQuery(parameters);
        System.out.println("Сформированный SQL-запрос: " + sqlQuery);
    }

    public static String generateSqlQuery(Map<String, Object> parameters) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM cars WHERE ");

        for (Map.Entry<String, Object> entry : parameters.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (value != null) {
                sb.append(key).append(" = ");

                if (value instanceof String || value instanceof Character) {
                    sb.append("'").append(value).append("'");
                } else {
                    sb.append(value);
                }

                sb.append(" AND ");
            }
        }

        sb.delete(sb.length() - 5, sb.length()); // Удаление последнего " AND "

        return sb.toString();
    }
}
