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
                "Saúde & Bem-estar",
                "descrição",
                "conteúdo",
                "Matheus Telles, UniVass",
                "14h00",
                "15h00",
                "21 setembro 2022",
                "21 setembro 2022",
                1
        ));
        this.noticeList.add(new Post(
                2,
                "Desabamento deixa ao menos 6 mortos e 31 feridos em Itapecerica da Serra; veja vídeo",
                "Informações preliminares apontam que cerca de 64 funcionários estavam em uma reunião no momento da ocorrência; caso ocorreu em empresa de contêineres na Grande São Paulo",
                "Um desabamento em Itapecerica da Serra, na Grnade São Paulo, deixou ao menos seis mortos e 31 feridos na manhã desta terça-feira, 20. Segundo informações preliminares, cerca de 64 funcionários da empresa estavam em uma reunião com candidatos a deputado no momento da ocorrência.",
                "Priscila Mengue, Estadão",
                "11h53",
                "15h09",
                "20 setembro 2022",
                "20 setembro 2022",
                1
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
