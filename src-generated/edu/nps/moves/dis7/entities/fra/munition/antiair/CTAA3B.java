package edu.nps.moves.dis7.entities.fra.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3bbf1c0d
 * Country: France (FRA)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 29546
 */
public class CTAA3B extends EntityType
{
    public CTAA3B()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 21048, Ballistic
        setSubCategory((byte)5); // uid 29544, 40mm
        setSpecific((byte)1); // uid 29545, Cased Telescopic Ammunition (CTA)
        setExtra((byte)1); // uid 29546, CTA A3B
    }
}
