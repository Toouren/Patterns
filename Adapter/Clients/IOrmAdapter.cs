using homework_4.Models;

namespace homework_4.Clients
{
    public interface IOrmAdapter
    {
        (DbUserEntity, DbUserInfoEntity) getUser(int userId);
        void addUser(DbUserEntity user, DbUserInfoEntity userInfo);
        void removeUser(int userId);
    }
}
