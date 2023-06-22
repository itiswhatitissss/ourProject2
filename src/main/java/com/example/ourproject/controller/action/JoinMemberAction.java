package com.example.ourproject.controller.action;

import com.example.ourproject.VO.MemberVO;
import com.example.ourproject.dao.DAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class JoinMemberAction implements Action {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        MemberVO vo = new MemberVO();

        vo.setId(request.getParameter("id"));
        vo.setPw(request.getParameter("pw"));
        vo.setEmail(request.getParameter("email"));
        vo.setName(request.getParameter("name"));
        vo.setBirthDate(request.getParameter("birthDate"));
        vo.setGender(request.getParameter("gender"));
        vo.setPhone(request.getParameter("phone"));

        DAO dao = DAO.getInstance();
        int result = dao.insertMember(vo);

        new MemberListAction().execute(request,response);

        response.sendRedirect("BoardServlet?command=member_list");

    }
}
