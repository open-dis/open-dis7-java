package edu.nps.moves.dis7.entities.jpn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35563e4c;
 * Country: Japan (JPN);
 * Entity kind: Munition;
 * Domain: ANTI_SHIP;
 *
 * Entity type uid: 29039
 */
public class Type91ASM1C extends EntityType
{
    /** Default constructor */
    public Type91ASM1C()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21690, Guided
        setSubCategory((byte)3); // uid 29037, ASM-1/1C (Type 80/91)
        setSpecific((byte)2); // uid 29039, Type 91 (ASM-1C)
    }
}
