package kz.aibek.springproject.dao;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {

//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public BookDAO(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<Book> index() {
//        return jdbcTemplate.query("SELECT*FROM Book", new BeanPropertyRowMapper<>(Book.class));
//    }
//
//
//    public Book show(int id) {
//        return jdbcTemplate.query("SELECT*FROM Book where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Book.class))
//                .stream().findAny().orElse(null);
//    }
//
//    public void save(Book book) {
//        jdbcTemplate.update("INSERT INTO Book (title,author,year) VALUES (?,?,?)", book.getTitle(),
//                book.getAuthor(),book.getYear());
//    }
//
//    public void update(int id, Book updatedBook) {
//        jdbcTemplate.update("UPDATE Book set title=?,author=?,year=? where id=?", updatedBook.getTitle(),
//                updatedBook.getAuthor(),updatedBook.getYear(),id);
//    }
//
//    public void delete(int id) {
//        jdbcTemplate.update("DELETE from Book where id=?", id);
//    }
//
//
//    public Optional<Person> getBookOwner(int id) {
//        return jdbcTemplate.query("SELECT Person.* from Book join Person on Book.person_id=Person.id "+
//                "where Book.id=?", new Object[]{id},new BeanPropertyRowMapper<>(Person.class)).stream().findAny();
//    }
//
//    public void release(int id){jdbcTemplate.update("UPDATE Book set person_id=null where id=?",id);}
//
//
//    public void assign(int id, Person selectedPerson) {
//        jdbcTemplate.update("UPDATE Book SET person_id=? where id=?",selectedPerson.getId(),id);
//
//    }
}
