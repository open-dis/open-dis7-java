package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38e83838;
 * Country: Belgium (BEL);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 30344
 */
public class FZ68FZ67wFZ149MULTIDARTWarhead extends EntityType
{
    /** Default constructor */
    public FZ68FZ67wFZ149MULTIDARTWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 30331, Ballistic
        setSubCategory((byte)2); // uid 30339, FZ FZ68/FZ67 FFAR (70 mm, 2.75 in)
        setSpecific((byte)5); // uid 30344, FZ68/FZ67 w/ FZ149 MULTIDART Warhead
    }
}
