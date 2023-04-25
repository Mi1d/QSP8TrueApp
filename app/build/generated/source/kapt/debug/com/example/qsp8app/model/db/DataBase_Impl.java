package com.example.qsp8app.model.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DataBase_Impl extends DataBase {
  private volatile LabelDao _labelDao;

  private volatile SortNoteDao _sortNoteDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LABEL_TABLE` (`text` TEXT NOT NULL, `targetDate` INTEGER NOT NULL, `addNoteTime` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `day` INTEGER NOT NULL, `sortNote` TEXT NOT NULL, `isTop` INTEGER NOT NULL, `isEnd` INTEGER NOT NULL, `endDate` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SORT_NOTE_TABLE` (`name` TEXT NOT NULL, `iconName` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd360775d7721bd86615101ad8642fcd6')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `LABEL_TABLE`");
        _db.execSQL("DROP TABLE IF EXISTS `SORT_NOTE_TABLE`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsLABELTABLE = new HashMap<String, TableInfo.Column>(9);
        _columnsLABELTABLE.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("targetDate", new TableInfo.Column("targetDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("addNoteTime", new TableInfo.Column("addNoteTime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("day", new TableInfo.Column("day", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("sortNote", new TableInfo.Column("sortNote", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("isTop", new TableInfo.Column("isTop", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("isEnd", new TableInfo.Column("isEnd", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLABELTABLE.put("endDate", new TableInfo.Column("endDate", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLABELTABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLABELTABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLABELTABLE = new TableInfo("LABEL_TABLE", _columnsLABELTABLE, _foreignKeysLABELTABLE, _indicesLABELTABLE);
        final TableInfo _existingLABELTABLE = TableInfo.read(_db, "LABEL_TABLE");
        if (! _infoLABELTABLE.equals(_existingLABELTABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "LABEL_TABLE(com.example.qsp8app.model.bean.Label).\n"
                  + " Expected:\n" + _infoLABELTABLE + "\n"
                  + " Found:\n" + _existingLABELTABLE);
        }
        final HashMap<String, TableInfo.Column> _columnsSORTNOTETABLE = new HashMap<String, TableInfo.Column>(3);
        _columnsSORTNOTETABLE.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSORTNOTETABLE.put("iconName", new TableInfo.Column("iconName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSORTNOTETABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSORTNOTETABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSORTNOTETABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSORTNOTETABLE = new TableInfo("SORT_NOTE_TABLE", _columnsSORTNOTETABLE, _foreignKeysSORTNOTETABLE, _indicesSORTNOTETABLE);
        final TableInfo _existingSORTNOTETABLE = TableInfo.read(_db, "SORT_NOTE_TABLE");
        if (! _infoSORTNOTETABLE.equals(_existingSORTNOTETABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "SORT_NOTE_TABLE(com.example.qsp8app.model.bean.SortNote).\n"
                  + " Expected:\n" + _infoSORTNOTETABLE + "\n"
                  + " Found:\n" + _existingSORTNOTETABLE);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d360775d7721bd86615101ad8642fcd6", "902e50e2ea6e27343022f66018df73e9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "LABEL_TABLE","SORT_NOTE_TABLE");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `LABEL_TABLE`");
      _db.execSQL("DELETE FROM `SORT_NOTE_TABLE`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(LabelDao.class, LabelDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SortNoteDao.class, SortNoteDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public LabelDao labelDao() {
    if (_labelDao != null) {
      return _labelDao;
    } else {
      synchronized(this) {
        if(_labelDao == null) {
          _labelDao = new LabelDao_Impl(this);
        }
        return _labelDao;
      }
    }
  }

  @Override
  public SortNoteDao sortNoteDao() {
    if (_sortNoteDao != null) {
      return _sortNoteDao;
    } else {
      synchronized(this) {
        if(_sortNoteDao == null) {
          _sortNoteDao = new SortNoteDao_Impl(this);
        }
        return _sortNoteDao;
      }
    }
  }
}
