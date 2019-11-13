using homework_4.Clients;
using homework_4.Models;

namespace homework_4.SecondOrmLibrary
{
    public class SecondOrmAdapter : IOrmAdapter
    {
        private ISecondOrm _secondOrm;

        public SecondOrmAdapter(ISecondOrm secondOrm)
        {
            _secondOrm = secondOrm;
        }

        public (DbUserEntity, DbUserInfoEntity) getUser(int userId)
        {
            var user = _secondOrm.Context.Users.First(i => i.Id == userId);
            var userInfo = _secondOrm.Context.UserInfos.First(i => i.Id == user.InfoId);

            return (user, userInfo);
        }

        public void addUser(DbUserEntity user, DbUserInfoEntity userInfo)
        {
            _secondOrm.Context.Users.Add(user);
            _secondOrm.Context.UserInfos.Add(userInfo);
        }

        public void removeUser(int userId)
        {
            var user = _secondOrm.Context.Users.First(i => i.Id == userId);

            _secondOrm.Context.Users.RemoveWhere(x => x.Id == userId);
            _secondOrm.Context.UserInfos.RemoveWhere(x => x.Id == user.InfoId);
        }
    }

}