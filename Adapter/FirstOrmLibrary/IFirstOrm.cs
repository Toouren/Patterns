using homework_4.Models.Interfaces;

namespace homework_4.FirstOrmLibrary
{
    public interface IFirstOrm<TDbEntity> where TDbEntity : IDbEntity
    {
        void Add(TDbEntity entity);
        TDbEntity Read(int id);
        void Delete(TDbEntity entity);
    }
}
