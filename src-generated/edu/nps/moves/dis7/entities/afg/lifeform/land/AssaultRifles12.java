package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4f402027;
 * Country: Afghanistan (AFG);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32200
 */
public class AssaultRifles12 extends EntityType
{
    /** Default constructor */
    public AssaultRifles12()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)53); // uid 32196, Afghan Border Police (ABP)
        setSubCategory((byte)5); // uid 32200, Assault Rifles
    }
}
