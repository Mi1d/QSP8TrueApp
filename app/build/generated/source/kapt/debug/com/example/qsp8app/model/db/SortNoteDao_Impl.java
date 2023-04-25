package com.example.qsp8app.model.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.qsp8app.model.bean.SortNote;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SortNoteDao_Impl implements SortNoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SortNote> __insertionAdapterOfSortNote;

  private final EntityDeletionOrUpdateAdapter<SortNote> __deletionAdapterOfSortNote;

  private final EntityDeletionOrUpdateAdapter<SortNote> __updateAdapterOfSortNote;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllSortNote;

  public SortNoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSortNote = new EntityInsertionAdapter<SortNote>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `SORT_NOTE_TABLE` (`name`,`iconName`,`id`) VALUES (?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SortNote value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getIconName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIconName());
        }
        stmt.bindLong(3, value.getId());
      }
    };
    this.__deletionAdapterOfSortNote = new EntityDeletionOrUpdateAdapter<SortNote>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `SORT_NOTE_TABLE` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SortNote value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfSortNote = new EntityDeletionOrUpdateAdapter<SortNote>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `SORT_NOTE_TABLE` SET `name` = ?,`iconName` = ?,`id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SortNote value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getIconName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getIconName());
        }
        stmt.bindLong(3, value.getId());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllSortNote = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM sort_note_table";
        return _query;
      }
    };
  }

  @Override
  public void insertSortNote(final SortNote sortNote) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSortNote.insert(sortNote);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteSortNote(final SortNote sortNote) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfSortNote.handle(sortNote);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSortNote(final SortNote sortNote) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSortNote.handle(sortNote);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllSortNote() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllSortNote.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllSortNote.release(_stmt);
    }
  }

  @Override
  public List<SortNote> getAllSortNotes() {
    final String _sql = "SELECT `sort_note_table`.`name` AS `name`, `sort_note_table`.`iconName` AS `iconName`, `sort_note_table`.`id` AS `id` FROM sort_note_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = 0;
      final int _cursorIndexOfIconName = 1;
      final int _cursorIndexOfId = 2;
      final List<SortNote> _result = new ArrayList<SortNote>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SortNote _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpIconName;
        if (_cursor.isNull(_cursorIndexOfIconName)) {
          _tmpIconName = null;
        } else {
          _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
        }
        _item = new SortNote(_tmpName,_tmpIconName);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<SortNote>> getAllSortNotesByObserve() {
    final String _sql = "SELECT `sort_note_table`.`name` AS `name`, `sort_note_table`.`iconName` AS `iconName`, `sort_note_table`.`id` AS `id` FROM sort_note_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"sort_note_table"}, false, new Callable<List<SortNote>>() {
      @Override
      public List<SortNote> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfName = 0;
          final int _cursorIndexOfIconName = 1;
          final int _cursorIndexOfId = 2;
          final List<SortNote> _result = new ArrayList<SortNote>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SortNote _item;
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpIconName;
            if (_cursor.isNull(_cursorIndexOfIconName)) {
              _tmpIconName = null;
            } else {
              _tmpIconName = _cursor.getString(_cursorIndexOfIconName);
            }
            _item = new SortNote(_tmpName,_tmpIconName);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public List<String> getAllSortNotesName() {
    final String _sql = "SELECT name FROM sort_note_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getSortNoteCount() {
    final String _sql = "SELECT COUNT(*) FROM sort_note_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getInt(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
