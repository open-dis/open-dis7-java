package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@32e830a0;
 * Country: Afghanistan (AFG);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32757
 */
public class CivilianAdolescentMaleUnarmed extends EntityType
{
    /** Default constructor */
    public CivilianAdolescentMaleUnarmed()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32211, Civilian
        setSubCategory((byte)0); // uid 32755, None
        setSpecific((byte)0); // uid 32756, Civilian, Unarmed
        setExtra((byte)40); // uid 32757, Civilian Adolescent, Male (Unarmed)
    }
}
