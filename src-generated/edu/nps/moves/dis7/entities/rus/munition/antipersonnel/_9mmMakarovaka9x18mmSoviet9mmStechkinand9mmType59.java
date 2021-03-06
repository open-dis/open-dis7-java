package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b6c2be6;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 20647
 */
public class _9mmMakarovaka9x18mmSoviet9mmStechkinand9mmType59 extends EntityType
{
    /** Default constructor */
    public _9mmMakarovaka9x18mmSoviet9mmStechkinand9mmType59()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)3); // uid 20646, 9 mm
        setSpecific((byte)1); // uid 20647, 9-mm Makarov (aka 9 x 18 mm Soviet, 9-mm Stechkin, and 9-mm Type 59)
    }
}
