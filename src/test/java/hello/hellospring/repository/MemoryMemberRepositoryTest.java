package hello.hellospring.repository;


import hello.hellospring.domain.Member;
import org.junit.Test;


public class MemoryMemberRepositoryTest  {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();

    }






}
