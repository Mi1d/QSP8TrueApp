package com.example.qsp8app.model.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.qsp8app.model.bean.Label;
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
public final class LabelDao_Impl implements LabelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Label> __insertionAdapterOfLabel;

  private final EntityDeletionOrUpdateAdapter<Label> __deletionAdapterOfLabel;

  private final EntityDeletionOrUpdateAdapter<Label> __updateAdapterOfLabel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllLabel;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLabelByName;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLabelBySortNote;

  public LabelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLabel = new EntityInsertionAdapter<Label>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `LABEL_TABLE` (`text`,`targetDate`,`addNoteTime`,`id`,`day`,`sortNote`,`isTop`,`isEnd`,`endDate`) VALUES (?,?,?,nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Label value) {
        if (value.getText() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getText());
        }
        stmt.bindLong(2, value.getTargetDate());
        stmt.bindLong(3, value.getAddNoteTime());
        stmt.bindLong(4, value.getId());
        stmt.bindLong(5, value.getDay());
        if (value.getSortNote() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSortNote());
        }
        final int _tmp = value.isTop() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        final int _tmp_1 = value.isEnd() ? 1 : 0;
        stmt.bindLong(8, _tmp_1);
        stmt.bindLong(9, value.getEndDate());
      }
    };
    this.__deletionAdapterOfLabel = new EntityDeletionOrUpdateAdapter<Label>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LABEL_TABLE` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Label value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfLabel = new EntityDeletionOrUpdateAdapter<Label>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `LABEL_TABLE` SET `text` = ?,`targetDate` = ?,`addNoteTime` = ?,`id` = ?,`day` = ?,`sortNote` = ?,`isTop` = ?,`isEnd` = ?,`endDate` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Label value) {
        if (value.getText() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getText());
        }
        stmt.bindLong(2, value.getTargetDate());
        stmt.bindLong(3, value.getAddNoteTime());
        stmt.bindLong(4, value.getId());
        stmt.bindLong(5, value.getDay());
        if (value.getSortNote() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSortNote());
        }
        final int _tmp = value.isTop() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        final int _tmp_1 = value.isEnd() ? 1 : 0;
        stmt.bindLong(8, _tmp_1);
        stmt.bindLong(9, value.getEndDate());
        stmt.bindLong(10, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllLabel = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM label_table";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLabelByName = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE label_table SET text =? WHERE id =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateLabelBySortNote = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE label_table SET sortNote =? WHERE id =?";
        return _query;
      }
    };
  }

  @Override
  public void insertLabel(final Label label) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLabel.insert(label);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteLabel(final Label label) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfLabel.handle(label);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLabel(final Label label) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfLabel.handle(label);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllLabel() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllLabel.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllLabel.release(_stmt);
    }
  }

  @Override
  public void updateLabelByName(final String name, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLabelByName.acquire();
    int _argIndex = 1;
    if (name == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, name);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLabelByName.release(_stmt);
    }
  }

  @Override
  public void updateLabelBySortNote(final String sortNote, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLabelBySortNote.acquire();
    int _argIndex = 1;
    if (sortNote == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, sortNote);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLabelBySortNote.release(_stmt);
    }
  }

  @Override
  public LiveData<List<Label>> getAllLabelsByObserve() {
    final String _sql = "SELECT `label_table`.`text` AS `text`, `label_table`.`targetDate` AS `targetDate`, `label_table`.`addNoteTime` AS `addNoteTime`, `label_table`.`id` AS `id`, `label_table`.`day` AS `day`, `label_table`.`sortNote` AS `sortNote`, `label_table`.`isTop` AS `isTop`, `label_table`.`isEnd` AS `isEnd`, `label_table`.`endDate` AS `endDate` FROM label_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"label_table"}, false, new Callable<List<Label>>() {
      @Override
      public List<Label> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfText = 0;
          final int _cursorIndexOfTargetDate = 1;
          final int _cursorIndexOfAddNoteTime = 2;
          final int _cursorIndexOfId = 3;
          final int _cursorIndexOfDay = 4;
          final int _cursorIndexOfSortNote = 5;
          final int _cursorIndexOfIsTop = 6;
          final int _cursorIndexOfIsEnd = 7;
          final int _cursorIndexOfEndDate = 8;
          final List<Label> _result = new ArrayList<Label>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Label _item;
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final long _tmpTargetDate;
            _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
            final long _tmpAddNoteTime;
            _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
            _item = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            final long _tmpDay;
            _tmpDay = _cursor.getLong(_cursorIndexOfDay);
            _item.setDay(_tmpDay);
            final String _tmpSortNote;
            if (_cursor.isNull(_cursorIndexOfSortNote)) {
              _tmpSortNote = null;
            } else {
              _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
            }
            _item.setSortNote(_tmpSortNote);
            final boolean _tmpIsTop;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTop);
            _tmpIsTop = _tmp != 0;
            _item.setTop(_tmpIsTop);
            final boolean _tmpIsEnd;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
            _tmpIsEnd = _tmp_1 != 0;
            _item.setEnd(_tmpIsEnd);
            final long _tmpEndDate;
            _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
            _item.setEndDate(_tmpEndDate);
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
  public List<Label> getAllLabels() {
    final String _sql = "SELECT `label_table`.`text` AS `text`, `label_table`.`targetDate` AS `targetDate`, `label_table`.`addNoteTime` AS `addNoteTime`, `label_table`.`id` AS `id`, `label_table`.`day` AS `day`, `label_table`.`sortNote` AS `sortNote`, `label_table`.`isTop` AS `isTop`, `label_table`.`isEnd` AS `isEnd`, `label_table`.`endDate` AS `endDate` FROM label_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfText = 0;
      final int _cursorIndexOfTargetDate = 1;
      final int _cursorIndexOfAddNoteTime = 2;
      final int _cursorIndexOfId = 3;
      final int _cursorIndexOfDay = 4;
      final int _cursorIndexOfSortNote = 5;
      final int _cursorIndexOfIsTop = 6;
      final int _cursorIndexOfIsEnd = 7;
      final int _cursorIndexOfEndDate = 8;
      final List<Label> _result = new ArrayList<Label>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Label _item;
        final String _tmpText;
        if (_cursor.isNull(_cursorIndexOfText)) {
          _tmpText = null;
        } else {
          _tmpText = _cursor.getString(_cursorIndexOfText);
        }
        final long _tmpTargetDate;
        _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
        final long _tmpAddNoteTime;
        _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
        _item = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final long _tmpDay;
        _tmpDay = _cursor.getLong(_cursorIndexOfDay);
        _item.setDay(_tmpDay);
        final String _tmpSortNote;
        if (_cursor.isNull(_cursorIndexOfSortNote)) {
          _tmpSortNote = null;
        } else {
          _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
        }
        _item.setSortNote(_tmpSortNote);
        final boolean _tmpIsTop;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsTop);
        _tmpIsTop = _tmp != 0;
        _item.setTop(_tmpIsTop);
        final boolean _tmpIsEnd;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
        _tmpIsEnd = _tmp_1 != 0;
        _item.setEnd(_tmpIsEnd);
        final long _tmpEndDate;
        _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> getAllLabelsName() {
    final String _sql = "SELECT text FROM label_table";
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
  public List<Label> getSameSortNoteLabelList(final String sortNoteName) {
    final String _sql = "SELECT * FROM label_table WHERE sortNote =? ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sortNoteName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortNoteName);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
      final int _cursorIndexOfTargetDate = CursorUtil.getColumnIndexOrThrow(_cursor, "targetDate");
      final int _cursorIndexOfAddNoteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addNoteTime");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
      final int _cursorIndexOfSortNote = CursorUtil.getColumnIndexOrThrow(_cursor, "sortNote");
      final int _cursorIndexOfIsTop = CursorUtil.getColumnIndexOrThrow(_cursor, "isTop");
      final int _cursorIndexOfIsEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnd");
      final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
      final List<Label> _result = new ArrayList<Label>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Label _item;
        final String _tmpText;
        if (_cursor.isNull(_cursorIndexOfText)) {
          _tmpText = null;
        } else {
          _tmpText = _cursor.getString(_cursorIndexOfText);
        }
        final long _tmpTargetDate;
        _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
        final long _tmpAddNoteTime;
        _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
        _item = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final long _tmpDay;
        _tmpDay = _cursor.getLong(_cursorIndexOfDay);
        _item.setDay(_tmpDay);
        final String _tmpSortNote;
        if (_cursor.isNull(_cursorIndexOfSortNote)) {
          _tmpSortNote = null;
        } else {
          _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
        }
        _item.setSortNote(_tmpSortNote);
        final boolean _tmpIsTop;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsTop);
        _tmpIsTop = _tmp != 0;
        _item.setTop(_tmpIsTop);
        final boolean _tmpIsEnd;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
        _tmpIsEnd = _tmp_1 != 0;
        _item.setEnd(_tmpIsEnd);
        final long _tmpEndDate;
        _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
        _item.setEndDate(_tmpEndDate);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Label getLabelByName(final String text) {
    final String _sql = "SELECT * FROM label_table WHERE text =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (text == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, text);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
      final int _cursorIndexOfTargetDate = CursorUtil.getColumnIndexOrThrow(_cursor, "targetDate");
      final int _cursorIndexOfAddNoteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addNoteTime");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
      final int _cursorIndexOfSortNote = CursorUtil.getColumnIndexOrThrow(_cursor, "sortNote");
      final int _cursorIndexOfIsTop = CursorUtil.getColumnIndexOrThrow(_cursor, "isTop");
      final int _cursorIndexOfIsEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnd");
      final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
      final Label _result;
      if(_cursor.moveToFirst()) {
        final String _tmpText;
        if (_cursor.isNull(_cursorIndexOfText)) {
          _tmpText = null;
        } else {
          _tmpText = _cursor.getString(_cursorIndexOfText);
        }
        final long _tmpTargetDate;
        _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
        final long _tmpAddNoteTime;
        _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
        _result = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final long _tmpDay;
        _tmpDay = _cursor.getLong(_cursorIndexOfDay);
        _result.setDay(_tmpDay);
        final String _tmpSortNote;
        if (_cursor.isNull(_cursorIndexOfSortNote)) {
          _tmpSortNote = null;
        } else {
          _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
        }
        _result.setSortNote(_tmpSortNote);
        final boolean _tmpIsTop;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsTop);
        _tmpIsTop = _tmp != 0;
        _result.setTop(_tmpIsTop);
        final boolean _tmpIsEnd;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
        _tmpIsEnd = _tmp_1 != 0;
        _result.setEnd(_tmpIsEnd);
        final long _tmpEndDate;
        _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
        _result.setEndDate(_tmpEndDate);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public int getLabelCount() {
    final String _sql = "SELECT COUNT(*) FROM label_table";
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

  @Override
  public int getLabelCountBySameSort(final String sortNoteName) {
    final String _sql = "SELECT COUNT(*) FROM label_table WHERE sortNote =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sortNoteName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sortNoteName);
    }
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

  @Override
  public LiveData<Label> getLabel(final int id) {
    final String _sql = "SELECT * FROM label_table WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return __db.getInvalidationTracker().createLiveData(new String[]{"label_table"}, false, new Callable<Label>() {
      @Override
      public Label call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTargetDate = CursorUtil.getColumnIndexOrThrow(_cursor, "targetDate");
          final int _cursorIndexOfAddNoteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addNoteTime");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
          final int _cursorIndexOfSortNote = CursorUtil.getColumnIndexOrThrow(_cursor, "sortNote");
          final int _cursorIndexOfIsTop = CursorUtil.getColumnIndexOrThrow(_cursor, "isTop");
          final int _cursorIndexOfIsEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnd");
          final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
          final Label _result;
          if(_cursor.moveToFirst()) {
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final long _tmpTargetDate;
            _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
            final long _tmpAddNoteTime;
            _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
            _result = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
            final long _tmpDay;
            _tmpDay = _cursor.getLong(_cursorIndexOfDay);
            _result.setDay(_tmpDay);
            final String _tmpSortNote;
            if (_cursor.isNull(_cursorIndexOfSortNote)) {
              _tmpSortNote = null;
            } else {
              _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
            }
            _result.setSortNote(_tmpSortNote);
            final boolean _tmpIsTop;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsTop);
            _tmpIsTop = _tmp != 0;
            _result.setTop(_tmpIsTop);
            final boolean _tmpIsEnd;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
            _tmpIsEnd = _tmp_1 != 0;
            _result.setEnd(_tmpIsEnd);
            final long _tmpEndDate;
            _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
            _result.setEndDate(_tmpEndDate);
          } else {
            _result = null;
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
  public Label getLabelById(final int id) {
    final String _sql = "SELECT * FROM label_table WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
      final int _cursorIndexOfTargetDate = CursorUtil.getColumnIndexOrThrow(_cursor, "targetDate");
      final int _cursorIndexOfAddNoteTime = CursorUtil.getColumnIndexOrThrow(_cursor, "addNoteTime");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
      final int _cursorIndexOfSortNote = CursorUtil.getColumnIndexOrThrow(_cursor, "sortNote");
      final int _cursorIndexOfIsTop = CursorUtil.getColumnIndexOrThrow(_cursor, "isTop");
      final int _cursorIndexOfIsEnd = CursorUtil.getColumnIndexOrThrow(_cursor, "isEnd");
      final int _cursorIndexOfEndDate = CursorUtil.getColumnIndexOrThrow(_cursor, "endDate");
      final Label _result;
      if(_cursor.moveToFirst()) {
        final String _tmpText;
        if (_cursor.isNull(_cursorIndexOfText)) {
          _tmpText = null;
        } else {
          _tmpText = _cursor.getString(_cursorIndexOfText);
        }
        final long _tmpTargetDate;
        _tmpTargetDate = _cursor.getLong(_cursorIndexOfTargetDate);
        final long _tmpAddNoteTime;
        _tmpAddNoteTime = _cursor.getLong(_cursorIndexOfAddNoteTime);
        _result = new Label(_tmpText,_tmpTargetDate,_tmpAddNoteTime);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final long _tmpDay;
        _tmpDay = _cursor.getLong(_cursorIndexOfDay);
        _result.setDay(_tmpDay);
        final String _tmpSortNote;
        if (_cursor.isNull(_cursorIndexOfSortNote)) {
          _tmpSortNote = null;
        } else {
          _tmpSortNote = _cursor.getString(_cursorIndexOfSortNote);
        }
        _result.setSortNote(_tmpSortNote);
        final boolean _tmpIsTop;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsTop);
        _tmpIsTop = _tmp != 0;
        _result.setTop(_tmpIsTop);
        final boolean _tmpIsEnd;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsEnd);
        _tmpIsEnd = _tmp_1 != 0;
        _result.setEnd(_tmpIsEnd);
        final long _tmpEndDate;
        _tmpEndDate = _cursor.getLong(_cursorIndexOfEndDate);
        _result.setEndDate(_tmpEndDate);
      } else {
        _result = null;
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
