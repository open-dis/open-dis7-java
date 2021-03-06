package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@383cdd4d;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 20645
 */
public class _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891 extends EntityType
{
    /** Default constructor */
    public _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)2); // uid 20641, 7.62 mm
        setSpecific((byte)4); // uid 20645, 7.62-mm Mosin-Nagant (aka 7.62 x 54R, 7.62-mm Soviet Rimmed, and 7.62-mm obr 1891)
    }
}
