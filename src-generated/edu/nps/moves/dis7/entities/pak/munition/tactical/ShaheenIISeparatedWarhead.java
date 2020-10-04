package edu.nps.moves.dis7.entities.pak.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50122012
 * Country: Pakistan (PAK)
 * Entity kind: Munition
 * Domain: TACTICAL
 *
 * Entity type uid: 32543
 */
public class ShaheenIISeparatedWarhead extends EntityType
{
    public ShaheenIISeparatedWarhead()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 31392, Guided
        setSubCategory((byte)4); // uid 32541, Shaheen II (Hatf-6)
        setSpecific((byte)2); // uid 32543, Shaheen II Separated Warhead
    }
}