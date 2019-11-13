using System.Linq;
using homework_4.Models;

namespace homework_4.Clients
{
    public class UserClient
    {
        private IOrmAdapter _ormAdapter;

        public UserClient(IOrmAdapter ormAdapter)
        {
            _ormAdapter = ormAdapter;
        }

        public (DbUserEntity, DbUserInfoEntity) Get(int userId)
        {
            return _ormAdapter.getUser(userId);
        }

        public void Add(DbUserEntity user, DbUserInfoEntity userInfo)
        {
            _ormAdapter.addUser(user, userInfo);
        }

        public void Remove(int userId)
        {
            _ormAdapter.removeUser(userId);
        }
    }
}
