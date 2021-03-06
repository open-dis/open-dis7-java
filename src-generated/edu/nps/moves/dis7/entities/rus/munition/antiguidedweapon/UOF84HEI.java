package edu.nps.moves.dis7.entities.rus.munition.antiguidedweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1510b9a2;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_GUIDED_WEAPON;
 *
 * Entity type uid: 20506
 */
public class UOF84HEI extends EntityType
{
    /** Default constructor */
    public UOF84HEI()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_GUIDED_WEAPON));

        setCategory((byte)2); // uid 20504, Ballistic
        setSubCategory((byte)1); // uid 20505, 30 mm
        setSpecific((byte)1); // uid 20506, UOF-84 HE-I
    }
}
