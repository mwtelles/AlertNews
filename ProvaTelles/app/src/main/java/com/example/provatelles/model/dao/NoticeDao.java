package com.example.provatelles.model.dao;

import com.example.provatelles.model.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class NoticeDao {
    private List<Post> noticeList;

    public NoticeDao() {
        this.noticeList = new ArrayList<>();
        this.noticeList.add(new Post(
                1,
                "Desabamento deixa ao menos 6 mortos e 31 feridos em Itapecerica da Serra",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h50",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "1 min de leitura"
        ));
        this.noticeList.add(new Post(
                2,
                "Matheus Telles recebe 10 na prova",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grande São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h51",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "2 min de leitura"
        ));
        this.noticeList.add(new Post(
                3,
                "Desastre na Grande São Paulo",
                "Desabamento em empresa deixa ao menos cinco mortos em Itapecerica da Serra, funcionários participavam de reunião com candidatos a deputado",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h52",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "3 min de leitura"
        ));
        this.noticeList.add(new Post(
                4,
                "Tássio da 10 pro Matheus Telles",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h53",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "4 min de leitura"
        ));
        this.noticeList.add(new Post(
                5,
                "Desabamento deixa ao menos 6 mortos e 31 feridos em Itapecerica da Serra",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h54",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "5 min de leitura"
        ));
        this.noticeList.add(new Post(
                6,
                "Você foi hipnotizado, Matheus Telles merece 10",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h55",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                "6 min de leitura"
        ));
    }

    public List<Post> getAllNotices() {
        return this.noticeList;
    }

    public Post getNoticeById(int id){

        for (Post notice : this.noticeList) {
            if(notice.getId() == id) {
                return notice;
            }
        }
        return null;
    }
}
