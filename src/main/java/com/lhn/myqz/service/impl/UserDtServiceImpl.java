package com.lhn.myqz.service.impl;

import com.lhn.myqz.dao.UserDtDao;
import com.lhn.myqz.entity.UserDt;
import com.lhn.myqz.service.UserDtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserDtServiceImpl implements UserDtService {

    @Autowired
    UserDtDao userDtDao;

    @Override
    public Integer insertUserDt(UserDt userDt, OutputStream os) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String a = "../resources/static/images/";
        String b = "E:/idea-workspace/myqz/src/main/resources/static/images/";
        String c = userDt.getAccountNumber()+df.format(new Date())+".jpg";
        String fileSrc = b+c;
        String dtImg = a+c;
        File src = new File(fileSrc);
        if(userDt.getBase64() != null && !"".equals(userDt.getBase64())){
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                os = new FileOutputStream(src,true);//默认为false，true表示打开append模式
                byte[] imgData = decoder.decodeBuffer(userDt.getBase64());
                os.write(imgData,0,imgData.length);
                os.flush();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(os!=null) {
                    try {
                        //释放资源
                        os.close();
                        userDt.setDtImg(dtImg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return userDtDao.insertUserDt(userDt);
    }

    @Override
    public List<UserDt> queryUserDtByAccountNumber(String accountNumber,String seleted,String friendAccountNumber) {
        return userDtDao.queryUserDtByAccountNumber(accountNumber,seleted,friendAccountNumber);
    }

    @Override
    public Integer deleteUserDt(Integer id) {
        return null;
    }

    @Override
    public Integer updateUserDt(UserDt userDt) {
        return userDtDao.updateUserDt(userDt);
    }

}
