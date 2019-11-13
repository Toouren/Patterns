using homework_4.Clients;
using homework_4.Models;

namespace homework_4.FirstOrmLibrary
{
    public class FirstOrmAdapter : IOrmAdapter
    {
        private IFirstOrm<DbUserEntity> _firstOrm1;
        private IFirstOrm<DbUserInfoEntity> _firstOrm2;

        public FirstOrmAdapter(IFirstOrm<DbUserEntity> firstOrm1, IFirstOrm<DbUserInfoEntity> firstOrm2)
        {
            _firstOrm1 = firstOrm1;
            _firstOrm2 = firstOrm2;
        }

        public (DbUserEntity, DbUserInfoEntity) getUser(int userId)
        {
            var user = _firstOrm1.Read(userId);
            var userInfo = _firstOrm2.Read(user.InfoId);
            
            return (user, userInfo);
        }

        public void addUser(DbUserEntity user, DbUserInfoEntity userInfo)
        {
            _firstOrm1.Add(user);
            _firstOrm2.Add(userInfo);
        }

        public void removeUser(int userId)
        {
            var user = _firstOrm1.Read(userId);
            var userInfo = _firstOrm2.Read(user.InfoId);

            _firstOrm2.Delete(userInfo);
            _firstOrm1.Delete(user);
        }
    }
}
