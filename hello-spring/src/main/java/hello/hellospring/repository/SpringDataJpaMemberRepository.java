package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // findByName, findByNameAndId 이런 식으로 하면 'JPQL select m from Member m where m.name = ?' 이런 식으로 해준다.
    @Override
    Optional<Member> findByName(String name);
}
